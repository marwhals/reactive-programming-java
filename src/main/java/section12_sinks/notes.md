# Sinks

---

---

## Sinks / Summary

| Sink Type         | Publisher Type | # of Subscribers | Behaviour                                                               |
|-------------------|----------------|------------------|-------------------------------------------------------------------------|
| One               | Mono           | N                |                                                                         |
| Many - Uni cast   | Flux           | 1                | subscriber can join late if required messages, will be stored in memory |
| Many - Multi cast | Flux           | N                | late subscribers can not see the messages                               |
| Many - Replay     | Flux           | N                | will replay of all values to late subscribers                           |


---

