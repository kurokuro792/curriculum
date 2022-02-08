---
title:"item_table"
author: "Yu'n Craft"
data: 2022/02/07
output:
    word_document:
    path:word.docx
---  

|システム名|テーブル物理名|テーブル論理名|作成者| 作成日 |
|---|---|---|---|---|
|Topシステム|Top|Topページ|黒木|2022/02/08|

| No. | 物理名             | 論理名      | データ型    | NotNull | PK | UK | Default | 備考    |
|-----|-----------------|----------|---------|---------|----|----|---------|-------|
| 1   | freeks_logo     | freeksロゴ | TRUE    | 〇       |    |    |         | リンクです |
| 2   | username        | ユーザー名    | Varchar | 〇       | 〇  |    |         |       |
| 3   | select_language | 選択言語     | TRUE    | 〇       |    |    |         |       |
| 4   | curriculum      | カリキュラム   | TRUE    | 〇       |
