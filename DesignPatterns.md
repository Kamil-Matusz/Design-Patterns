## Kategorie wzorców:
### Wzorce Kreacyjne
- Builder
- Factory Method
- Abstract Factory
- Prototype
- Singleton

### Wzorce Strukturalne
- Facade
- Composite
- Proxy
- Bridge
- Decorator
- Adapter
- Flyweight

### Wzorce Behawioralne
- Visitor
- Iterator
- Interpreter
- Mediator
- Observer
## Builder

Wzorzec **Builder** (Budowniczy) to kreacyjny wzorzec projektowy, który umożliwia tworzenie złożonych obiektów krok po kroku. Oddziela proces konstruowania obiektu od jego reprezentacji, dzięki czemu ten sam proces budowania może tworzyć różne reprezentacje obiektu. Pozwala na tworzenie różnych typów i reprezentacji obiektów przy użyciu tego samego kodu konstrukcyjnego.

- Odseparowanie sposobu reprezentacji i metody konstrukcji złożonych struktur obiektowych
- Wykorzystanie jednego mechanizmu konstrukcyjnego do tworzenia struktur o różnej reprezentacji

![Builder](assets/Pasted%20image%2020250430212716.png)

## Factory Method

Wzorzec **Factory Method** (pol. **Metoda Wytwórcza**) to jeden z kreacyjnych wzorców projektowych, który pozwala zdefiniować interfejs do tworzenia obiektów, ale pozwala podklasom decydować, jakiego typu obiekt utworzyć. Innymi słowy, deleguje tworzenie obiektów do klas potomnych.

- Oddzielenie procesu tworzenia obiektu od jego użycia
- Kod klienta nie zależy bezpośrednio od konkretnych klas obiektów, które są tworzone

![Factory Method](assets/Pasted%20image%2020250519152901.png)

## Abstract Factory

Wzorzec **Abstract Factory** (pol. **Abstrakcyjna Fabryka**) to również **wzorzec kreacyjny**, ale bardziej rozbudowany niż Factory Method. Umożliwia tworzenie **całych rodzin powiązanych obiektów** bez konieczności określania ich konkretnych klas.

- Łatwa zmiana całych grup produktów poprzez zmianę używanej Concrete Factory
- Wydzielenie interfejsu do tworzenia obiektów
- Odseparowanie klienta od szczegółów implementacji obiektów

![Abstract Factory](assets/Pasted%20image%2020250506111524.png)

## Singleton

Wzorzec **Singleton** to jeden z najprostszych **wzorców kreacyjnych**, którego celem jest **zapewnienie, że dana klasa ma tylko jedną instancję** i dostarczenie globalnego punktu dostępu do tej instancji.
Definiuje statyczną metodę udostępniającą instancję klasy

- przejmuje odpowiedzialność za tworzenie instancji własnej klasy
- klient nie zarządza instancją klasy. Otrzymuje ją na żądanie
- może zarządzać także swoimi podklasami
- można łatwo rozszerzyć do puli obiektów
- jest zwykle obiektem bezstanowym
- zachowuje się podobnie do zmiennej globalnej
- może powodować zwiększenie liczby powiązań w systemie

![Singleton](assets/Pasted%20image%2020250506173806.png)

## Prototype

Umożliwienie tworzenia obiektów na podstawie przykładowej instancji, a nie poprzez wywołanie konstruktora. Tworzy nowe obiekty na bazie klonowanie już istniejących egzemplarzy zamiast tworzenia ich od zera.

- Możliwość tworzenia obiektów poprzez przykład
- Uproszczona konstrukcja podobnych obiektów
- pominięcie wyboru konstruktora
- ograniczenie liczby podklas w systemie

![Prototype](assets/Pasted%20image%2020250518105652.png)

## Decorator

Wzorzec **Dekorator** (ang. _Decorator_) to strukturalny wzorzec projektowy, który pozwala **dynamicznie dodawać nowe funkcjonalności** do obiektów bez zmieniania ich kodu źródłowego. Wzorzec ten pozwala na dekorowanie zachowania klasy, czyli zmianę jej funkcjonalności bez potrzeby dziedziczenia, które mogłoby stworzyć zbyt wiele mało elastycznych klas.

![Decorator](assets/Pasted%20image%2020250601165620.png)

## Fasade

Wzorzec **Fasada** (ang. _Facade_) to strukturalny wzorzec projektowy, który upraszcza interakcję z **złożonym systemem** poprzez dostarczenie **jednego punktu dostępu** – prostego interfejsu ukrywającego wewnętrzne szczegóły działania. Często program podczas tworzenia ewoluuje i rośnie stopień jego komplikacji. Możemy zauważyć że oprócz korzyści wzorce mają też ujemną cechę: czasami generują one bardzo wiele dodatkowych klas, przez co trudniej jest zrozumieć działanie programu. Poza tym programy często składają się z szeregu podsystemów, z których każdy posiada swój własny skomplikowany interfejs. Dlatego też warto wprowadzić Fasadę – ujednolicony interfejs do szeregu interfejsów poszczególnych podsystemów.

- duże zmniejszenie liczby zależności między klientem a złożonym systemem — jeśli klient nie korzysta bezpośrednio z żadnych elementów ukrytych za fasadą systemu, całość jest łatwiejsza w konserwacji i utrzymaniu,
- wprowadzenie podziału aplikacji na warstwy, który ułatwia niezależny rozwój klienta i złożonego systemu,
- możliwość zablokowania klientowi drogi do bezpośredniego korzystania ze złożonego systemu, jeśli jest to konieczne,
- kod klienta wykorzystującego fasadę jest czytelniejszy i łatwiejszy w zrozumieniu.
### Kluczowe cechy:
- Ukrywa złożoność systemu przed klientem.
- Ułatwia korzystanie z wielu klas poprzez jedną, spójną klasę „fasady”.
- Nie zmienia działania podsystemu, a jedynie upraszcza jego użycie.

![Fasade](assets/Pasted%20image%2020250601170230.png)

## Composite

Wzorzec **Composite** (kompozyt) to strukturalny wzorzec projektowy, który pozwala traktować obiekty indywidualne i ich złożone kompozycje w jednolity sposób. Umożliwia budowanie hierarchii obiektów w strukturze drzewiastej, w której zarówno elementy proste (liście), jak i złożone (gałęzie) implementują wspólny interfejs. Wzorzec kompozytu pozwala na jednolite traktowanie komponentów i obiektów z nich złożonych poprzez specyfikację ich wspólnego interfejsu.

**Przykład z życia: zapis działania matematycznego, składa się ono z liczb, symboli operatorów i nawiasów. Także przepis kuchenny, jeśli za komponenty uznamy poszczególne składniki.**

- Umożliwia definiowanie hierarchii z obiektów prostych i złożonych
- Upraszcza kod klientów
- Ułatwia dodawanie komponentów nowego rodzaju
- Może sprawić, że projekt stanie się zanadto ogólny

![Composite](assets/Pasted%20image%2020250611201604.png)

## Bridge

Wzorzec **Bridge** (most) to strukturalny wzorzec projektowy, który **oddziela abstrakcję od implementacji**, dzięki czemu można je rozwijać **niezależnie**. Umożliwia tworzenie elastycznych systemów, w których zmiany w jednej hierarchii (np. typy interfejsów) nie wpływają na drugą (np. konkretne implementacje). Stosowany, gdy mamy do czynienia z wieloma wariantami klas, które należy ze sobą łączyć bez mnożenia liczby klas.

• Oddziela abstrakcję od implementacji, tak że mogą one zmieniać się niezależnie od siebie
• Zwiększa łatwość rozbudowy
• Ukrywa przed klientem szczegóły implementacji

#### Bridge - kiedy używać
• Gdy chcemy uniknąć trwałego połączenia abstrakcji i jej implementacji, np. implementacja ma być wybrana lub zmieniona w trakcie wykonania.
• Zarówno abstrakcje jak i implementacje powinny być rozszerzalne przez tworzenie klas potomnych. Most pozwala na łączenie różnych abstrakcji z implementacjami i ich niezależną rozbudową
• Zmiany w implementacji nie powinny mieć wpływu na klientów (nie powinno być konieczności ich rekompilacji)
• Gdy chcemy używać jednej implementacji w wielu obiektach jednocześnie (np. przez licznik referencji) i ma to być ukryte przed klientem
• Prosty przykład: wiele obiektów typu String może odnosić się do tego samego łańcucha w pamięci

![Bridge 1](assets/Pasted%20image%2020250614213018.png)

![Bridge 2](assets/Pasted%20image%2020250614213044.png)
## Proxy

Wzorzec **Proxy** to strukturalny wzorzec projektowy, który **dostarcza zastępczy obiekt** (pełnomocnika), kontrolujący dostęp do innego obiektu. Proxy może dodawać dodatkową logikę, np. **autoryzację, logowanie, cache, opóźnione tworzenie obiektu (lazy loading)** itp. Pośrednik bardzo przypomina dekoratora. Ma on taką samą strukturę, ale jego intencja jest całkiem inna. Obiekt pośrednika ma za zadanie "udawać" obiekt rzeczywisty albo pośredniczyć w komunikacji z nim. Ma to sens, gdy jest to np. obiekt na innej maszynie lub gdy dane obiektu nie są jeszcze dostępne.

• Pośrednik ukrywa rzeczywiste położenie obiektu
• Pośrednik może optymalizować dostęp do obiektu
• Pozwala na realizację tzw. Sprytnych odwołań

![Proxy](assets/Pasted%20image%2020250614213221.png)
## Flyweight

Wzorzec **Flyweight** (z ang. „muszka”, „lekkopiórkowy”) to strukturalny wzorzec projektowy, który **pozwala ograniczyć zużycie pamięci poprzez współdzielenie wspólnych danych przez wiele obiektów**. Waga Piórkowa ogranicza ilość tworzonych instancji obiektów, przez przeniesienie części danych ze stanu obiektu do parametrów metod, co umożliwia ich współdzielenie. Takie rozwiązanie wpływa korzystnie na szybkość wykonywania się programu – niekiedy niekontrolowane powstawanie zbyt dużej ilości obiektów spowalnia jego pracę.

- ograniczenie liczby obiektów używanych w trakcie wykonywania programu, a co za tym idzie zaoszczędzenie pamięci aplikacji – tym większe, im więcej obiektów jest współdzielonych
- składowanie danych stanu współdzielonych obiektów odbywa się w jednej lokalizacji
- utrata przez pojedyncze, logiczne egzemplarze klasy możliwości posiadania zachowań niezależnych od pozostałych egzemplarzy

![Flyweight](assets/Pasted%20image%2020250621090559.png)
## Adapter

Wzorzec **Adapter** to strukturalny wzorzec projektowy, który **umożliwia współpracę klas o niekompatybilnych interfejsach** — działa jak „tłumacz” między nimi. Jeśli masz istniejącą klasę, której interfejs nie pasuje do tego, czego oczekuje klient, możesz stworzyć **adapter**, który „opakowuje” tę klasę i udostępnia oczekiwany interfejs. Wzorzec ten jest strukturalnym wzorcem projektowym pozwalającym na współdziałanie ze sobą obiektów o niekompatybilnych interfejsach. Adapter przekształca interfejs jednej z klas na interfejs drugiej klasy. Innym zadaniem omawianego wzorca jest opakowanie istniejącego interfejsu w nowy.

- możliwość adaptacji klasy wraz z jej podklasami (związane jest to z wykorzystaniem składania obiektów),
- możliwość dodawania nowej funkcjonalności,
- brak możliwości przeładowania metod obiektu adaptowanego

![Adapter](assets/Pasted%20image%2020250621091215.png)

## Interpreter

**Wzorzec Interpreter** (ang. _Interpreter_) to jeden z **wzorców behawioralnych** zaproponowanych przez Gang of Four. Jego głównym celem jest interpretacja zdań zdefiniowanego języka, poprzez reprezentację jego gramatyki oraz stworzenie interpretera, który potrafi analizować i wykonywać polecenia zapisane w tym języku. Definiuje opis gramatyki pewnego języka interpretowalnego a także tworzy dla niej obiekt, dzięki któremu będzie możliwe rozwiązanie opisanego problemu.

![Interpreter](assets/Pasted%20image%2020250628204133.png)
• Client o tworzy abstrakcyjne drzewo składni przedstawiające zdanie w języku i uruchamia operację interpretacji.
• Context o przechowuje informacje globalne.
• AbstractExpression o definiuje operację (lub operacje) "interpretowania", czyli pojedynczy węzeł w drzewie składni abstrakcyjnej.
• TerminalExpression o implementuje operację dla symbolu terminalnego (który występuje w przetwarzanych danych wewnętrznych).
• NonterminalExpression o implementuje operację (regułę gramatyczną) dla symbolu nieterminalnego.

• Modyfikowanie gotowej gramatyki jest stosunkowo proste. Wystarczy utworzyć nowe klasy, które będą reprezentowały nowe produkcje.
• Przedstawianie każdej reguły gramatyki w klasie sprawia, że wzorzec jest prosty w implementacji. • Jest niepraktyczny jeśli gramatyka składa się z więcej niż kilku produkcji (wzrasta wtedy liczebność klas)

## Iterator

Wzorzec **Iterator** to jeden z fundamentalnych wzorców projektowych należących do grupy **wzorców behawioralnych**. Jego głównym celem jest umożliwienie sekwencyjnego przechodzenia (iterowania) po elementach zbioru (kolekcji) **bez ujawniania wewnętrznej struktury** tej kolekcji.
Umożliwienie sekwencyjnego dostępu do elementów kolekcji bez ujawniania jej wewnętrznej implementacji

![Iterator](assets/Pasted%20image%2020250630160705.png)

- Abstrakcyjny dostęp do elementów kolekcji
- Niezależność od implementacji kolekcji
- Możliwość współistnienia różnych iteratorów w jednej kolekcji
- Możliwość istnienia wielu iteratorów naraz o każdy iterator przechowuje informacje o aktualnym przebiegu o iteratory są obiektami stanowymi

## Visitor

Wzorzec **Visitor** to wzorzec projektowy z grupy wzorców behawioralnych, który pozwala na oddzielenie algorytmów od struktur obiektów, na których operują. Umożliwia dodanie nowych operacji do istniejących klas bez konieczności modyfikowania ich kodu.
Działa to przez zdefiniowanie osobnej klasy „odwiedzającej” (Visitor), która implementuje metody operujące na elementach struktury (np. różnych typach obiektów). Obiekty struktury mają metodę `accept`, która przyjmuje obiekt Visitor i wywołuje na nim odpowiednią metodę.
- Reprezentacja operacji do wykonania na elementach heterogenicznej struktury
- Realizacja operacji w sposób specyficzny dla typu odwiedzanego elementu
- Umożliwienie tworzenia nowych operacji bez konieczności modyfikacji klas wewnątrz struktury

![Visitor 1](assets/Pasted%20image%2020250701211759.png)
![Visitor 2](assets/Pasted%20image%2020250701211822.png)

## Observer

**Wzorzec Observer** (obserwator) to wzorzec projektowy należący do grupy wzorców behawioralnych. Służy do tworzenia zależności jeden-do-wielu między obiektami, tak aby zmiana stanu jednego obiektu (nazywanego **subiektem** lub **obserwowanym**) była automatycznie przekazywana wszystkim obiektom zależnym (nazywanym **obserwatorami**).

![Observer](assets/Pasted%20image%2020250712222230.png)

• Luźniejsze powiązania pomiędzy obiektami:
- obiekt Subject komunikuje się z innymi obiektami przez interfejs Observer
- obiekty Subject i Observers mogą należeć do różnych warstw abstrakcji
  • Programowe rozgłaszanie komunikatów • Spójność stanu pomiędzy obiektami Subject
  i Observers
  • Skalowalność aktualizacji o push: Observers otrzymują kompletny stan obiektu Subject
- pull: Observers otrzymują powiadomienie i referencję do obiektu Subject

## Mediator

**Wzorzec Mediator** to wzorzec projektowy z grupy behawioralnych, który **centralizuje komunikację pomiędzy obiektami**, eliminując potrzebę tworzenia bezpośrednich zależności między nimi.

![Mediator](assets/Pasted%20image%2020250713170514.png)

•Centralizacja mechanizmu komunikacji o wyłączna odpowiedzialność obiektu Mediator
- zmiana mechanizmu wymaga tylko zmiany Mediatora
- prostota komunikacji vs. złożoność Mediatora
  • Niezależność obiektów Colleague od siebie
  • Uproszczenie protokołów obiektowych
- Zamiana relacji wiele-wiele na relacje jeden-wiele