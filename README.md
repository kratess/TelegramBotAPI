# TelegramBotAPI
Version 1.0


## Docs
[ALL methods](https://core.telegram.org/bots/api#available-methods) on the official Telegram Bot API page

## How to get updates from bot
There are 2 methods
- Webhooks (Setup a callback server. Telegram will send request to our server)
- Long polling (We will send periodic request to Telegram server)

- [x] For now only Long Polling can be used.
- [x] Complete the toString() method with json

### Long Polling
```java
bot.setUpdateListener(new UpdateEvent() {
  @Override
  public void onUpdate(Update update) {
    int hour = LocalDateTime.now().getHour();
    int minute = LocalDateTime.now().getMinute();
    int second = LocalDateTime.now().getSecond();

    String time = "[" + hour + ":" + minute + ":" + second + "]";

    System.out.println(time);
    System.out.println(update.toString());
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
