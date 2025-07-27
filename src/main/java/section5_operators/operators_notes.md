# Operators notes

---

## Methods

- filter
- map
- log
- take
- takeWhile
- takeUtil

---

## doOnNext

- Mutation is bad
- Functional programming prefers pure functions (with no side effects)!!!
  - Prefer pure functions!
  - Entity objects are mutable objects

---

## Transform TODO notes and see docs

---

## Summary

- Operators are processors
  - They are both producers and subscribers
  - Like a data pipeline
- Data typically comes from a UI in a stream
  - You will apply some logic
  - Finally you will give it your database driver to store it in a database
- Could be the other way where you query the data base
  - Apply some business logic and you give it to the UI for the display

### operators

- filter
- map
- take / takeWhile / takeUntil
- delayElements
- do Hooks
- onErrorReturn / onErrorResume / onErrorContinue
- timeout
- defaultIfEmpty / switchIfEmpty
- handle
- transform