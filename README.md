Opis aplikacji

Aplikacja pozwala zwiększać i zmniejszać licznik za pomocą przycisków. Przycisk Reset ustawia wartość na 0. Licznik nie może być mniejszy od zera, a próba odjęcia przy zerze wyświetla komunikat Toast.

Obsługa zdarzeń

Przyciski +1 i -1 korzystają ze wspólnego listenera counterListener. Dzięki temu obsługa obu przycisków znajduje się w jednym miejscu, a rozróżnienie działania odbywa się na podstawie ID przycisku.