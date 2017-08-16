OkHttpClient client = new OkHttpClient();

Request request = new Request.Builder()
  .url("http://preprod.api.datatiger.com/ping")
  .get()
  .addHeader("accept", "application/json")
  .addHeader("cache-control", "no-cache")
  .addHeader("postman-token", "213b260a-d158-cffd-4a0f-ddc632444de7")
  .build();

Response response = client.newCall(request).execute();
