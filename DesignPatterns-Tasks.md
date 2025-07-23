## Builder

Wykorzystując odpowiedni wzorzec projektowy zrealizuj interfejs programistyczny oraz jego implementację, która pozwoli na wprowadzenie danych osobowych studentów tego samego kierunku, tak aby można było wybrać określoną specjalność (sieci komputerowe, grafika, technologie wytwarzania oprogramowania, inżynieria systemów informatycznych). Dane te powinny następnie zostać zapisane w plikach dwóch różnych typów. Wybór reprezentacji obiektu powinien należeć jednak do użytkownika, którego życzeniem może być jeden lub większa ilość typów obiektów reprezentacji zbiorów wyjściowych.

Wykorzystując właściwy wzorzec projektowy napisz program, który będzie umożliwiał wprowadzenie tekstu z konsoli lub jako parametr tablicy łańcuchowej, tak, aby można go było następnie posortować poprzez wywołanie metody sortuj(). Sposób wyboru zapisu tekstu ma być reprezentowany przez oddzielną klasę.

Implementując właściwie dobrany wzorzec projektowy zbuduj aplikację wspierającą przygotowanie indywidualnych zestawów posiłków dla użytkowników zgodnie z ich preferencjami i wymaganiami żywieniowymi. Użytkownik powinien mieć możliwość wygenerowania zestawu trzech posiłków dziennie (śniadanie, obiad, kolacja), dopasowanych do wybranego typu diety, takiego jak klasyczna, wegetariańska, wysokobiałkowa lub niskowęglowodanowa. Każdy posiłek powinien zawierać nazwę, listę składników oraz sumaryczną wartość kaloryczną. Aplikacja powinna umożliwiać łatwe tworzenie różnych wariantów zestawów posiłków w oparciu o zdefiniowane wcześniej schematy dietetyczne, jak również zapewniać możliwość przeglądania i pobierania szczegółowych informacji o posiłkach w uproszczonej formie (tylko nazwa i kalorie). Przyjęta architektura rozwiązania powinna umożliwiać elastyczne dodawanie nowych typów diet i posiłków bez konieczności modyfikowania istniejącego kodu. Zbudowane w wyniku końcowym klasy powinny zawierać właściwe pola i metody, tak, aby umożliwiały one prawidłowe definiowanie właściwości każdego zestawu posiłków, poszczególnych dań oraz zapewniały dostęp do przejrzystej, zgodnej z potrzebami użytkownika reprezentacji planu żywieniowego.

## Factory Method

Napisz kod klasy języka Java, która zwraca obiekt typu Double lub Integer, w zależności od rodzaju liczby przekazanej do konstruktora w postaci tekstowej. W rozwiązaniu należy zastosować odpowiedni wzorzec projektowy.

Wykorzystując odpowiedni wzorzec projektowy napisz aplikację pozwalającą na obliczenie pola
i obwodu prostokąta, rombu, trójkąta oraz koła. Użytkownik powinien mieć możliwość wprowadzenia rodzaju figury geometrycznej z klawiatury. Następnie rozszerz aplikację
o możliwość obliczania pola i objętości dla brył geometrycznych typu: sześcian, ostrosłup i walec.

Implementując właściwie dobrany wzorzec projektowy zbuduj aplikację do obsługi systemu powiadomień kontekstowych dla platformy internetowej. Aplikacja ta powinna umożliwiać dynamiczne generowanie powiadomień w zależności od typu zdarzenia, które wystąpiło w systemie, takich jak: zakończenie procesu przetwarzania danych, wystąpienie błędu, przekroczenie limitu zasobów lub próba wykonania nieautoryzowanej operacji. Każdy typ zdarzenia powinien skutkować utworzeniem odpowiedniego powiadomienia, którego treść oraz sposób prezentacji będą dopasowane do jego charakteru. Powiadomienia powinny być zróżnicowane w zależności od kontekstu. Powiadomienia informacyjne mogą być wyświetlane w tle, ostrzeżenia powinny wymagać świadomego potwierdzenia przez użytkownika, a błędy krytyczne blokować interfejs do czasu interwencji. Aplikacja powinna umożliwiać w przyszłości łatwe rozszerzanie katalogu typów powiadomień, np. o powiadomienia systemowe, administracyjne lub marketingowe, bez konieczności modyfikowania kodu istniejących klas odpowiedzialnych za ich obsługę. Zbudowane w wyniku końcowym klasy powinny zawierać właściwe pola i metody, tak, aby umożliwiały one prawidłowe definiowanie struktury i treści powiadomienia, jego reakcji na działania użytkownika oraz sposobu prezentacji w interfejsie, zależnie od charakterystyki danego zdarzenia.

## Abstract Factory

Dobierz właściwy wzorzec projektowy i utwórz kalkulator wynagrodzeń, tak aby na bazie wprowadzonej kwoty brutto, wyboru rodzaju umowy (umowa o pracę, umowa zlecenie, umowa
o dzieło) oraz roku podatkowego można było wywołać metodę oblicz() i wyświetlić ile wyniesie wynagrodzenie, które otrzymamy już jako wypłatę po odliczeniu odpowiednich składek (emerytalna, chorobowa, rentowa, zdrowotna) – w przypadku umowy zlecenia dla osoby będącej studentem lub nie, kosztów uzyskania przychodu (w przypadku umowy o dzieło) oraz kosztów pracodawcy związanych z rodzajem umowy

## Singleton

Wykorzystując odpowiedni wzorzec projektowy napisz aplikację obsługi konta bankowego, tak, aby można było wpłacać i wypłacać z konta w dowolnym bankomacie dla ustalonej kwoty debetu, wynoszącej 500 zł.

## Prototype

Napisz klasę, która będzie umożliwiała skopiowanie wybranego obrazu i umieszczenie go w co najmniej dwóch ramkach, w przypadku pierwszej kopii w orientacji pionowej, a w przypadku drugiej w poziomej.

Napisz klasę pozwalającą na zdefiniowanie i wyrysowanie obiektu, którym będzie prymityw geometryczny w postaci Punktu. Następnie wykorzystując klasę Punkt utwórz właściwą kolekcję, która będzie reprezentowana przez klasę Linia. Rozszerz powstałą strukturę do klas reprezentacji wymiaru 2D i 3D, tak aby można było utworzyć i wyrysować figury geometryczne Prostokąt
i Sześcian.
## Decorator

Implementując właściwy wzorzec projektowy zbuduj aplikację pozwalającą na zarządzanie praktykami zawodowymi realizowanymi w ramach studiów. Praktykę zawodową powinien zrealizować student, zarówno I-szego, jak i II-go stopnia studiów. Praktyka ta może być przez niego odbyta jako praktyka pilotażowa (zrealizowana w postaci konkretnych zadań zawodowych
u pracodawcy) lub jako praktyka kursowa (zrealizowana w postaci szkoleń, w tym również szkoleń zdalnych). W ramach praktyki student może wykonać projekt przedmiotowy, jak również pracę Prowadzący: dr inż. Arkadiusz Lewicki dyplomową. Praktykant posiada opiekuna naukowego
i opiekuna zawodowego, a zaliczenie praktyki kończy się zawsze egzaminem praktycznym lub teoretycznym. Każda ze zbudowanych klas powinna posiadać właściwe składowe w postaci pól
i metod, tak, aby można było właściwie definiować właściwości każdego obiektu i uzyskać pełne informacje.
## Composite

Stosując właściwy wzorzec projektowy napisz aplikację pozwalającą na symulację zarządzania pojedynczymi projektami składającymi się z jednego głównego zadania lub grupy zadań (do której należą zarówno zadania krytyczne, jak i niekrytyczne), a także portfelem projektów (w skład którego mogą wchodzić projekty z różnym typem zadań).

## Facade

Napisz klasę reprezentującą tablicę jednowymiarową łańcuchów znakowych (z metodami inicjalizacji tablicy, pobierania wartości wskazanego jako parametr elementu i zmiany zawartości tablicy), klasę reprezentującą plik tekstowy (z metodami zapisu, odczytu i buforowania przesyłanych danych), klasę widoku (z metodami pozwalającymi na wyświetlanie elementów tablicy w prosty sposób lub z zastosowaniem przekazanego jako parametr separatora). Następnie zaimplementuj właściwy wzorzec, który pozwoli klientowi na dostęp do uproszczonego interfejsu mającego tylko na celu stworzenie tablicy przechowującej listę zakupów, wyświetlenie jej
z zastosowaniem separatora „;” oraz zapis do pliku tekstowego.

## Bridge

Implementując właściwy wzorzec projektowy napisz aplikację obsługi kwiaciarni sprzedającej kwiaty różnych gatunków, o różnych nazwach, kolorach i cenach. Zamówienie klienta może dotyczyć kwiatów tego samego gatunku lub różnych gatunków.

Wybierając poprawny wzorzec projektowy, zaimplementuj właściwą architekturę systemu przetwarzania dokumentów, który pozwala na niezależne definiowanie typów dokumentów oraz operacji, jakie można na nich wykonać. System ten powinien wspierać różne formaty dokumentów, takie jak PDF, DOCX, TXT i RTF, z których każdy może posiadać własną implementację dostępu do treści. Równocześnie system ma umożliwiać zastosowanie różnorodnych operacji przetwarzania, takich jak ekstrakcja tekstu, analiza zawartości, czy konwersja do innego formatu. Kluczowym wymaganiem jest umożliwienie swobodnej kombinacji dowolnego typu dokumentu z dowolną operacją, bez konieczności modyfikacji istniejącego kodu. Rozszerzanie systemu o nowe typy dokumentów lub nowe operacje powinno być możliwe w sposób niezależny.
## Proxy

Implementując właściwy wzorzec projektowy napisz aplikację umożliwiającą dostęp do pełnej informacji na temat cen hurtowych oferowanego sprzętu sportowego tylko użytkownikom uprawnionym (firmom posiadającym numer KRS). Pozostałe osoby mają otrzymać natomiast tylko listę oferowanego sprzętu (w postaci nazwy, producenta i krótkiego opisu w postaci charakterystyki).

Stosując odpowiedni wzorzec projektowy napisz aplikację, która umożliwi klientowi połączenie się z serwerem i ściągnięcie właściwego żądanego zasobu sieciowego tylko w przypadku, kiedy połączenie w danym dniu następuje po raz pierwszy lub żądany zasób został zmodyfikowany.
W każdym innym przypadku, zasób związany z żądaniem powinien zostać wczytany z lokalnego archiwum. Wyświetl informację ilu już klientów ściągnęło dany zasób.

## Flyweight

Implementując właściwy wzorzec projektowy napisz aplikację prezentacji oferty księgarni, która reklamując się pragnie zaprezentować przykładowe pozycje egzemplarzy różnych wybranych obiektów, stanowiące w ten sposób zachętę do odwiedzenia księgarni. Oferta oprócz książek obejmuje czasopisma, mapy, przewodniki, a także kalendarze. Katalog oferty ma zawierać natomiast 100 losowo wybranych obiektów.
## Adapter

Stosując właściwy wzorzec projektowy utwórz oprogramowanie, które umożliwi zarządzanie
i przeglądanie książek z różnych źródeł danych. System ten ma integrować dane z bibliotek internetowych, lokalnych baz danych oraz zewnętrznych API książkowych, zapewniając spójny interfejs użytkownika bez względu na źródło danych. Oprogramowanie powinno zawierać mechanizmy adapterów, które konwertują dane z różnych formatów i interfejsów na jednolity format aplikacji biblioteki cyfrowej. Każdy adapter powinien być odpowiedzialny za dostosowanie danych z konkretnego źródła do wspólnego interfejsu aplikacji. Kluczową częścią implementacji jest też zapewnienie, aby użytkownicy mogli przeglądać, wyszukiwać i dodawać książki z każdego
z podłączonych źródeł danych bez komplikacji. Adaptery powinny zaś umożliwiać elastyczne dodawanie i zmianę źródeł danych bez konieczności modyfikacji istniejącego kodu aplikacji.

## Interpreter

Implementując właściwy wzorzec projektowy, zbuduj oprogramowanie pozwalające na interpretację i wyświetlenie pełnej nazwy oznaczenia kierunku studenta (na przykład dla wprowadzonego oznaczenia kierunku 1 U I Z - IPO – interpretacja jest następująca: 1- semestr studiów, U-studia uzupełniające, I- informatyka, Z- niestacjonarne, IPO – inżynieria produkcji oprogramowania).

Wiedząc, że każdą reprezentacje liczby całkowitej możemy przedstawić w systemie heksadecymalnym, gdzie na przykład 8AE oznacza wartość 2222 w systemie dziesiętnym napisz realizację właściwego szablonu pozwalającego na interpretację dowolnej liczby heksadecymalnej.

Stosując właściwy wzorzec napisz oprogramowanie umożliwiające analizę zapisów aktywności fizycznej użytkownika. Stworzone oprogramowanie powinno przyjmować dane w formacie HH-MM-SSSS-KKKKK-A, gdzie HH oznacza liczbę godzin, MM liczbę minut treningu, SSSS liczbę spalonych kalorii w danym czasie, KKKKK liczbę przebytych kroków, a A to typ aktywności (R- dla biegania, C - dla jazdy na rowerze i W - dla chodzenia). Na przykład zapis 02-30-1500-2475-R oznacza 2 godziny i 30 minut aktywności, 1500 spalonych kalorii podczas treningu, 24575 wykonanych kroków, a aktywność to bieganie.

## Iterator

Stosując właściwy wzorzec napisz aplikację, która umożliwia wyświetlanie wskazanej kolekcji elementów, ale w ten sposób, że najpierw wyświetlany jest element kolekcji o najmniejszej alokacji pamięciowej, następny o najmniejszej, id., bez zmiany pozycji obiektów w kolekcji.

Utwórz drzewo, a następnie stosując właściwy wzorzec napisz rozwiązanie, które umożliwi przeglądanie tego drzewa warstwami lub ścieżkami, w zależności od podanego parametru.

## Visitor

Implementując właściwy wzorzec projektowy napisz aplikację, która pozwoli na naliczanie przez pocztę innej opłaty w zależności od rodzaju przesyłki (list, paczka), jej wagi i miejsca dostarczenia. Obliczanie całkowitego kosztu przesyłki powinno być wykonywane w taki sposób, aby zmiana tej operacji nie wpływała na konieczność modyfikowania właściwości obiektów, którymi są przesyłki.

Implementując właściwy wzorzec projektowy napisz aplikację, która pozwoli na objęcie wyróżniających się studentów specjalnym programem nagradzania za osiągnięte wyniki. Programem tym mogą być objęci studenci, którzy uzyskają średnią 4.75 lub średnią 4.5, ale zaliczą wszystkie przedmioty w pierwszym terminie sesji. Dodatkowo do grupy tej mogą dołączyć osoby, które zdobędą tytuł laureata międzynarodowego konkursu. Program nagradzania przewiduje zwolnienie studentów z części czesnego, karnet upoważniający do korzystania z siłowni, większy limit wypożyczeń w bibliotece, a także korzystanie ze strzelnicy multimedialnej.

## Observer

Implementując właściwy wzorzec projektowy napisz aplikację, która będzie reprezentowała aukcję internetową związaną z licytacją oferowanego towaru (o danej nazwie i charakterystyce). Każdy towar może być licytowany przez dowolną ilość autoryzowanych użytkowników. Jego sprzedaż jest uzależniona od osiągnięcia ceny minimalnej. Cena końcowa może być jednak też dużo wyższa. |
O nowej ofercie cenowej zaproponowanej przez konkretnego aukcjonera automatycznie powiadamiani są wszyscy pozostali licytujący daną rzecz.

Stosując właściwy wzorzec projektowy napisz aplikację wspomagającą obsługę biura nieruchomości. Aplikacja ta ma pozwolić klientom biura na wprowadzenie pożądanych cech parametrycznych (w postaci metrażu [od … - do …], ceny [od … - do …], roku budowy [od … - do …], lokalizacji, ilości pomieszczeń) szukanego mieszkania lub domu. Jeżeli w bazie danych pojawi się oferta spełniająca dane kryteria klienta bądź klientów, to zostaną oni o tym automatycznie powiadomieni.

## Mediator

Stosując właściwy wzorzec projektowy napisz aplikację umożliwiającą dowolnemu klientowi zamówienie taksówki na wskazany przez niego adres. W tym celu klient dzwoni na ogólnodostępny numer korporacji taksówkowej i składa zamówienie na dany kurs. Korporacja zaś monitoruje na GPS stan wolnych w danej chwili taksówek i zleca to zamówienie, tej, która znajduje się najbliżej klienta.

Implementując właściwy wzorzec projektowy napisz aplikację, która pozwoli na monitorowanie przez system informatyczny wielu parametrów sterowania inteligentnym domem. Monitorowana jest między innymi wilgotność ziemi dostępnych roślin, wilgotność i temperatura powietrza, zawartość dwutlenku węgla w atmosferze pomieszczeń, bezpieczeństwo (stan naruszenia przestrzeni przez nieautoryzowany obiekt, stan zamków i związanych z nimi alarmów, itd.), stan zasilania urządzeń elektrycznych, a także alarm przeciwpożarowy. W momencie, kiedy zgłoszone zostanie odpowiednie zdarzenie, powinna zostać podjęta właściwa akcja, tak, aby można było osiągnąć oczekiwany stan dla danego typu obiektów