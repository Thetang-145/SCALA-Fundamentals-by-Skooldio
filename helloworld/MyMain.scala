import scalaj.http.Http
import xml.XML
object MyMain extends App {
  val response = Http(
    "https://feeds.bbci.co.uk/news/rss.xml"
  ).asString
  val xml = XML.loadString(response.body)
  val titles = xml.\\("item").\("title")
  val titleTexts = for{ title <- titles} yield title.text
  titleTexts.foreach(titleText => println(titleText))
}
