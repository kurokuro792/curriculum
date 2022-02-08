---
title:"rogin_table"
author: "Yu'n Craft"
data: 2022/02/07
output:
    word_document:
    path:word.docx
---  

| システム名 |テーブル物理名|テーブル論理名| 作成者 |作成日|
|-------|----------|----|---|---|
|ログインシステム|member|会員情報|黒木|2022/02/07|

| No. | 物理名            | 論理名     | データ型            | NotNull | PK | UK | Default | 備考    |
|-----|----------------|---------|-----------------|---------|----|----|---------|-------|
| 1   | corporate_code | 企業コード   | lnt(11)Unsigned | 〇       | 〇  |    |         | 数字のみ  |
| 2   | e-mail         | メールアドレス | Varchar         | 〇       | 〇  |    |         |       |
| 3   | password       | パスワード   | lnt(11)Unsigned | 〇       |    | 〇  |         |       |
| 4   | rogin_button   | ログインボタン | TRUE            | 〇       |    |    |         | ボタンです |
