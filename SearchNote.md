# 調べたことをメモしていくやつです

## RESTful API

### パス変数、クエリパラメータ、リクエストボディの使い分け

https://qiita.com/Shokorep/items/b7697a146cbb1c3e9f0b

#### パス変数

* 特定のリソース識別するために必要な情報を入れる
* 例えば、usersテーブルから、group1のユーザーのみ取得する際にgroupid=1をパス変数に組み込む
* 設計）https://example.com/groups/{group_id}
* 実際）https://example.com/groups/1

#### クエリパラメーター

* 特定のリソースを操作して取得する際に必要な情報を入れる
* 例えば、特定のグループ（group1）に紐づくユーザーを3件、user_idの降順で取得したいとしたら、それぞれsortやlimitという条件を組み込む
* 設計）https://example.com/groups/{group_id}?sort=boolean&lilmit=number
* 実際）https://example.com/groups/1?sort=false&limit=3
    * sortはfalseで降順、trueで昇順という条件としたとき

#### リクエストボディ

* 追加、更新する際の内容を入れる
* 例えば、特定のグループ（group1）を更新したいとしたら、JSONでリクエストする
* 設計）https://example.com/groups/{group_id}
* 設計JSON）{ group_name: "string", group_description: "string" }
* 実際）https://example.com/groups/1
* 実施JSON）{ group_name: "hogehogehoge", group_description: "hogehogeのグループ" }


