# Тренинг «Unit Testing & TDD»
24 ак. часа, 18 астр. часов

# Цели тренинга
## После тренинга участники смогут:
- [ ] Объяснить себе и менеджменту, где им нужны тесты, а где нет
- [ ] Разрабатывать тесты как «спецификации на примерах» в роли документации
- [ ] Разрабатывать поддерживаемые тесты и их наборы
- [ ] Использовать возможности фреймворка приложения для тестирования
- [ ] Подменять отдельные компоненты системы и внешние сервисы при тестировании
- [ ] Анализировать тестовое покрытие для принятия решений по тест-дизайну
- [ ] Описывать и реализовывать спецификации по модели BDD
- [ ] Обеспечивать поддерживаемый дизайн системы при помощи TDD
- [ ] Внедрять практики в команде

## В итоге бизнес получает:
- [ ] Контролируемый cycle time задач
- [ ] Контролируемое качество системы

# Программа
## Зачем мы собрались? (1 часа всего / _из них_ 0.5 часа практики)
- [ ] Обзор тренинга
- [ ] О тренере
- [ ] Разбивка по парам и знакомство-представление друг друга
- [ ] Приоритезация целей тренинга и сбор проблем

### Fork and then clone codebase for further development
```
git clone --depth 1 -b <YYYY-MM-project> https://github.com/eugene-krivosheyev/unit-testing-and-tdd
```

## Что такое автотест? (1.5/0.5)
- [ ] Каковы цели и задачи _авто_ тестов?
- [ ] В чем отличие от отладки?
- [ ] Определение модуля и возможные виды модулей

### Live Coding Demo на примере "общеизвестного класса"
- [ ] [Подключение основного фреймворка](https://github.com/junit-team/junit4/wiki)
- [ ] Понятие контракта по Б. Мейеру
- [ ] Именование тест-кейса и теста
- [ ] Понятие трасс выполнения (flows) и граничные условия
- [ ] Подход AAA
- [ ] Подход GWT из BDD
- [ ] Роль фикстуры
- [ ] [Забытый полуторный этап](https://github.com/junit-team/junit4/wiki/Assumptions-with-assume)
- [ ] Тест = фиксированная трасса выполнения
- [ ] Тестовый набор = спецификация компонента

### Coding Quest Iteration
- [ ] Given legacy codebase with Client and SavingAccount domain types
- [ ] When developers add guard clauses for creating Client and SavingAccount
- [ ] And cover these components with maintainable autotests
- [ ] Then coverage for these components should be ≥ 80%
- [ ] And public code review should state for maintainability

## Как замерять тестовое покрытие? (0.5/0)
- [ ] Понятие покрытия
- [ ] Виды расчета покрытия
- [ ] Инструменты расчета покрытия
- [ ] Анализ текущего покрытия
- [ ] Что покрывать в первую очередь в проектах?

## Как ускорить разработку автотестов за счет готовых фреймворков и библиотек? (1/0.5)
- [ ] Подключение вспомогательных фреймворков
- [ ] Простые сравнения средствами основного фреймворка
- [ ] [Типизированные сравнения средствами встроенного фреймворка](https://github.com/junit-team/junit4/wiki/Matchers-and-assertthat)
- [ ] [Типизированные сравнения средствами отдельного фреймворка](https://github.com/alexruiz/fest-assert-2.x/wiki/One-minute-starting-guide)
- [ ] [Таймауты](https://github.com/junit-team/junit4/wiki/Timeout-for-tests)
- [ ] [Исключения](https://github.com/junit-team/junit4/wiki/Exception-testing)
- [ ] [Параметризованные тесты](https://github.com/junit-team/junit4/wiki/Parameterized-tests)
- [ ] Расширение поведения тестов с помощью [запускальщиков](https://github.com/junit-team/junit4/wiki/Test-runners) и [правил](https://github.com/junit-team/junit4/wiki/Rules)

### Coding Quest Iteration
- [ ] Given legacy codebase with Client and SavingAccount domain types
- [ ] When developers add consistency rules for linking Client and SavingAccount
- [ ] And cover these components with maintainable autotests
- [ ] Then coverage for these components should be ≥ 90%
- [ ] And public code review should state for maintainability

## 5. Как писать интеграционные и модульные тесты? (1/0.5)
- [ ] Системные vs Интеграционные vs Модульные. В чем их специфика?
- [ ] Как по коду определить скоуп?
- [ ] Виды тест-дублеров
- [ ] State-based testing VS Interaction-based testing
- [ ] [Фреймворк тест-дублеров уровня объектов](https://site.mockito.org)
- [ ] [Фреймворк тест-дублеров уровня REST-сервисов](http://wiremock.org/docs/getting-started/)
- [ ] Как среда сборки различает UT и IT

### Coding Quest Iteration
- [ ] Given legacy codebase with Processing component
- [ ] When developers analyse and refactor production codebase for testability
- [ ] And cover this component with maintainable _unit_ autotests
- [ ] Then coverage for these component should be ≥ 90%
- [ ] And public code review should state for maintainability

## Архитектура и возможности тестирования фреймворка приложения
- [ ] Spring Core vs Spring MVC vs Spring Boot
- [ ] Configuration vs Context vs Profile
- [ ] Аннотации Spring Test
- [ ] Управление компонентами приложения для тестирования
- [ ] Аннотации тест-дублеров
- [ ] Тест дублеры для внешних сервисов

### Coding Quest Iteration
- [ ] Given legacy codebase with Spring Boot configuration
- [ ] And dependency for external service
- [ ] When developers refactor tests with Spring Boot Test support
- [ ] And external service doubling 
- [ ] Then coverage for these components should be ≥ 80%
- [ ] And public code review should state for maintainability

## Реализация фикстуры для обеспечения поддерживаемости тестов (1.5/1)
- [ ] Как максимально реюзать фикстуры?
- [ ] Наследование тест-кейсов
- [ ] [Методы фреймворка](https://github.com/junit-team/junit4/wiki/Test-fixtures)
- [ ] Fixture Builders

### Coding Quest Iteration
- [ ] Given test codebase
- [ ] When developers analyse and refactor test codebase for maintainability
- [ ] Then public code review should state for tests maintainability 

---

## Как группировать тесты в наборы? (0.5/0)
- [ ] Зачем нужны test suites?
- [ ] Способы группировки "из коробки" фреймворка: [группы](https://github.com/junit-team/junit4/wiki/aggregating-tests-in-suites) и [категории](https://github.com/junit-team/junit4/wiki/Categories)
- [ ] Способ группировки средствами среды сборки

### Coding Quest Iteration
- [ ] Given test codebase
- [ ] When developers group tests to suites
- [ ] Then cross-team code review should state for tests maintainability

## Как поддерживать качество тестов и снижать дублирование? (1/0.5)
### Как обеспечить качество самих тестов?
- [ ] Сначала поломанный тест
- [ ] Анализ тестового покрытия
- [ ] Ревью кода тестов
- [ ] Mutation coverage

### Анти-паттерны разработки модульных тестов: "вредные советы"
- [ ] Отношение к тестам не как к обычному коду
- [ ] Большие расфокусированные тесты
- [ ] Неговорящие имена
- [ ] Дублирование фикстуры
- [ ] Стопроцентное покрытие

### Coding Quest Iteration
- [ ] Given test codebase
- [ ] When developers analyse and refactor test codebase for maintainability
- [ ] Then cross-team code review should state for tests maintainability

## Как обеспечить тестопригодность дизайна legacy системы? (1.5/0.5)
- [ ] Как оценить тестопригодность legacy code?
- [ ] Метрика Coupling
- [ ] Метрика Cohesion
- [ ] Понятность/осознаваемость
- [ ] Каков тестопригодный дизайн?

### Live Coding Demo для реализации компонента Reporting и нового CheckingAccount
- [ ] Принципы проектирования SOLID
- [ ] Шаблоны Factory и DI
- [ ] Шаблоны Strategy/State
- [ ] Ключевая дилемма покрытия legacy code?

### Coding Quest Iteration
- [ ] Given legacy codebase with Reporting component
- [ ] When developers implement polymorhic testable implementation for Reporting and CheckingAccount
- [ ] Then cross-team code review should state for its testability

## Какую ценность дает практика TDD? (0.5/0)
- [ ] Что такое TDD?
- [ ] TDD как практика проектирования
- [ ] Зачем нужен TDD?
- [ ] Минимизация отладки
- [ ] Снижение затрат на инкрементальную разработку
- [ ] Быстрая обратная связь
- [ ] Повышение поддерживаемости дизайна
- [ ] Удобство API "из коробки"
- [ ] Тесты как документация
- [ ] Предсказуемость поставки
- [ ] Чистый работающий код
- [ ] Управление страхом

## В каком ритме писать по TDD? (1.5/0.5)
- [ ] Red – Green – Refactor
- [ ] Скорость отработки тестового набора как предусловие практики TDD

### Live Coding Demo для компонента Branch
- [ ] Операция добавления в branch

### Coding Quest Iteration
- [ ] Given legacy codebase with Branch domain type
- [ ] When developers implement full-functional Branch implementation
- [ ] And made it through TDD cycles
- [ ] Then coverage for this component should be 100%
- [ ] And public code review should state for maintainability

---

## [Базовые шаблоны TDD](https://www.dropbox.com/s/iiip3qdny3wwuyd/00.jpg?dl=0) (1.5/1)
- [ ] Test First
- [ ] Isolated Tests
- [ ] Assertion First
- [ ] Test Data
- [ ] Child Test
- [ ] Test List
- [ ] Mock Object
- [ ] Crash Test Dummy

### Coding Quest Iteration
- [ ] Given legacy codebase with Reporting service
- [ ] When developers implement reporting operation for branch
- [ ] And made it through TDD cycles
- [ ] Then coverage for this component should be 100%
- [ ] And coverage for this component should state this is _unit_ tests
- [ ] And public code review should state for maintainability

## Шаблоны красной и зеленой полосы (1.5/1)
### Красной полосы
- [ ] One-step Test
- [ ] Starter Test
- [ ] Another Test
- [ ] Regression Test

### Зеленой полосы
- [ ] Obvious Implementation
- [ ] Triangulation
- [ ] One to Many

### Coding Quest Iteration: TDD Ping-pong
- [ ] Given legacy codebase with Reporting service
- [ ] When developers implement reporting operations
- [ ] And made it through TDD cycles in pair ping-pong rules
- [ ] Then coverage for this component should be 100%
- [ ] And coverage for this component should state this is _unit_ tests
- [ ] And public code review should state for maintainability

### Типовые ошибки использования TDD
- [ ] Code First
- [ ] Too Many Obvious Implementation
- [ ] Too Many Triangulations
- [ ] Coverage Affinity
- [ ] Implementation Testing but not Contract Testing

## Какую ценность дает практика BDD? (1/0.5)
- [ ] Концепция BDD
- [ ] Архитектура фреймворка Cucumber
- [ ] Язык Gherkin

### Live Coding Demo
- [ ] Рефакторинг существующего теста на Cucumber
- [ ] Тестовая отчетность на Allure

### Coding Quest Iteration: ATDD
- [ ] Given legacy codebase
- [ ] And test developed
- [ ] When developers implement new given requirements
- [ ] And made it through ATDD cycles in pair ping-pong rules
- [ ] Then coverage for new code should be 100%
- [ ] And public code review should state for test and code maintainability


## Как внедрить практики в процесс разработки? (0.5/0)
### Каковы затраты на практики?
- [ ] Постановка экономической задачи
- [ ] Сопротивление участников
- [ ] Сопротивление менеджмента

### Как безопасно внедрить в команде?
- [ ] Общение с менеджментом
- [ ] Secure sandbox
- [ ] Последовательное расширение scope

## Финальная ретроспектива (0.5/0.5)
- [ ] План конкретных ближайших действий
