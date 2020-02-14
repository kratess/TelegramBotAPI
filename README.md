# TelegramBotAPI
Version 1.0


## Docs
[ALL methods](https://core.telegram.org/bots/api#available-methods) on the official Telegram Bot API page

## How to get updates from bot
There are 2 methods
- Webhooks (Setup a callback server. Telegram will send request to our server)
- Long polling (We will send periodic request to Telegram server)

- [x] For now only Long Polling can be used. We have in plan to add Webhooks but for moment don't have a vps for try it

### Long Polling
```java
bot.setUpdateListener(new UpdatesEvent() {
    @Override
    public void onUpdate(JSONObject updates) {
        System.out.println(updates.toString(4));
    }
}, 1000, 100, 0, null);
```
Return a JSONObject

## Send methods
[ALL methods](https://core.telegram.org/bots/api#available-methods) on the official Telegram Bot API page

```java
TelegramBot bot = new TelegramBot("xxxxxxxxx:yzyzyzyzyzyzyzyzyz-yzyzyzyzyz");
```
First we need to create an instance of the bot using the unique token gived by [Bot Father](https://t.me/botfather)

---

Then we need to create the request with one of the available methods

```java
SendMessage request = new SendMessage(chat_id, URLEncoder.encode("TEST message UTF-8", "UTF-8"));
```

---

So we must send it to the Telegram servers

Sync method:
```java
bot.execute(request);
```

Async method:
```java
bot.async_execute(request, new ExecuteEvent() {
    @Override
    public void onExecute(JSONObject result) {
        // NEXT
    }
});
```

The return of method `execute` is a JSONArray so we can read it

```java
System.out.println( result.toString(4) );
```

---
