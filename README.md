
# Rapport

Första steget för att hämta json-data från en webservice var att aktivera internet-access i android manifest med en kodrad, 
sedan la jag in länken från webservicen i MainActivity så att json-datan från länken hämtas och sparas på stringen.

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";

Andra steget var att lägga in en recyclerview i layouten (xml) som ska visa alla berg. Dock för att bergen ska kunna visas så måste 
även recyclerview_item läggas in vilket jag gjorde med textviews i en annan layoutfil som visar bergen på varje sida.

            <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/RecyclerViewId"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />

För att min recyclerview ska fungera så har jag också gjort en RecyclerViewAdapter som gör att min data faktiskt kan visas i min recyclerview
då den kopplar ihop JSON-datan med min recyclerview och recyclerview_item.


## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

```
function errorCallback(error) {
    switch(error.code) {
        case error.PERMISSION_DENIED:
            // Geolocation API stöds inte, gör något
            break;
        case error.POSITION_UNAVAILABLE:
            // Misslyckat positionsanrop, gör något
            break;
        case error.UNKNOWN_ERROR:
            // Okänt fel, gör något
            break;
    }
}
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
