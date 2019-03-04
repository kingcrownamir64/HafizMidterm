package json.parser;

        import com.google.gson.JsonArray;
        import com.google.gson.JsonElement;
        import com.google.gson.JsonObject;
        import com.google.gson.JsonParser;

        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.net.MalformedURLException;
        import java.net.URL;
        import java.net.URLConnection;
        import java.util.ArrayList;
        import java.util.List;

public class CnnAPI {
    public static void main(String[] args) throws MalformedURLException, IOException {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */

        String sURL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=0d9e35dfa3c140aab8bf9cdd70df957f";

        Headline head = null;
        List<Headline> headList = new ArrayList<>();
        URL url1 = new URL(sURL);
        URLConnection request = url1.openConnection();
        request.connect();
        JsonArray jsonArray = null;
        JsonObject rootObj = null;

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        if (root instanceof JsonObject) {
            rootObj = root.getAsJsonObject();
        } else if (root instanceof JsonArray) {
            jsonArray = root.getAsJsonArray();
        }

        while (jsonArray == null)
            jsonArray = rootObj.getAsJsonArray("articles");
        head = new Headline();
        for (int i = 0; i < jsonArray.size() - 1; i++) {
            try {
                JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();
                //you code start here
                String source = jsonobject.get("source").toString();
//                head.setSource(source);
                System.out.println(source);

                String author = jsonobject.get("author").toString();
//
                System.out.println(author);

                String title = jsonobject.get("title").toString();
//                head.setTitle(title);
                System.out.println(title);

                String description = jsonobject.get("description").toString();
//                head.setDescription(description);
                System.out.println(description);

                String url = jsonobject.get("url").toString();
//                head.setUrl(urll);
                System.out.println(url);

                String urlToImage = jsonobject.get("urlToImage").toString();
//                head.setUrlToImage(urlToImage);
                System.out.println(urlToImage);

                String publishedAt = jsonobject.get("publishedAt").toString();
//                head.setPublishedAt(publishedAt);
                System.out.println(publishedAt);

                String content = jsonobject.get("content").toString();
//                head.setContent(content);
                System.out.println(content);

                head = new Headline(head.getSource(), head.getAuthor(), head.getTitle(), head.getDescription(), head.getUrl(), head.getUrlToImage(), head.getPublishedAt(), head.getContent());

                headList.add(head);

            } catch (Exception ex) {

            }
        }
        //Print to the console.
        for (Headline entry : headList) {
            System.out.println(entry.getSource() + " " + entry.getAuthor() + " " + entry.getTitle() + " " + entry.getDescription() + " " + entry.getUrl() + " " + entry.getUrlToImage() + " " + entry.getPublishedAt() + " " + entry.getContent());
        }
    }
}