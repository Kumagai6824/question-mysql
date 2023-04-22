package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class HelloWorld {

    private final HelloMapper helloMapper;

    public HelloWorld(HelloMapper helloMapper) {
        this.helloMapper = helloMapper;
    }
    /*    private final HelloService helloService;

    public HelloWorld(HelloService helloService) {
        this.helloService = helloService;
    }*/

    @GetMapping("/hellos")
    public List<HelloResponse> getNames() {
        return helloMapper.findAll().stream().map(test -> new HelloResponse(test)).toList();
        /*       return helloService.findAll().stream().map(test -> new HelloResponse(test)).toList();*/
    }

    @PostMapping("/hellos")
    public ResponseEntity<String> createHello(@RequestBody CreateHelloForm form) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/hellos/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("Hello acount successfully created!" +
                " name: " + form.getName() +
                " country: " + form.getCountry());
    }

    @PatchMapping("/hellos/{id}")
    public ResponseEntity<Map<String, String>> updateHelloAcount(@PathVariable("id") int id, @RequestBody UpdateHelloForm form) {
        return ResponseEntity.ok(Map.of("message", "account successfully updated"));

    }

    @DeleteMapping("/hellos/{id}")
    public ResponseEntity<Map<String, String>> deleteHelloAcount(@PathVariable("id") int id) {
        return ResponseEntity.ok(Map.of("message", "account successfully deleted"));
    }

    //参考にしたサイト（https://it-jog.com/java/springboot/getquerystr）
    @GetMapping("/testquerystr")
    @ResponseBody
    public String testquerystr(@RequestParam(required = false) String fruit, @RequestParam(required = false) String animal) {
        String str = "";
        str = str.concat("fruit is " + fruit + "<br>");
        str = str.concat("animal is " + animal + "<br>");

        return str;
    }
}
