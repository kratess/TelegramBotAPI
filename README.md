# TelegramBotAPI
Version 1.0

## Docs
[ALL methods](https://core.telegram.org/bots/api#available-methods) on the official Telegram Bot API page

## Example of code
```java
TelegramBot bot = new TelegramBot("xxxxxxxxx:yzyzyzyzyzyzyzyzyz-yzyzyzyzyz");
```
Create instance of TelegramBot

---

```java
SendMessage request = new SendMessage(chat_id, URLEncoder.encode("TEST message UTF-8", "UTF-8"));
```
Simplest request to send

---

Let's send it
```java
bot.execute(request);

or

System.out.println( bot.execute(request).toString(4) );
```
The return of method `execute` is a JSONArray

---

## Get Updates
### For now only long polling
```java
        bot.setUpdateListener(new UpdatesEvent() {
            @Override
            public void onUpdate(JSONObject updates) {
                System.out.println(updates.toString(4));
            }
        }, 1000, 100, 0, null);
```
Return a JSONObject
