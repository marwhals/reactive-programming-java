# Mono notes

---

### Why not use block

- Lose benefits of reactive programming

---

# Summary

- Reactive programming is a programming paradigm to handle IO operations more efficiently
- Reactive streams is a specification
    - Reactor is an implementation
- Mono and Flux
    - Mono - emits 0 / 1 item
        - Request -> Response
    - Flux - emits 0...infinite
- Publisher -> Subscriber
- Your app -> DB
- Your app <- DB

---

## Mono

| Factory Methods | Usage                                                            |
|-----------------|------------------------------------------------------------------|
| `just`          | When they value is in memory already. No computation is required |
| `empty`         | No item to emit                                                  |
| `error`         | Emit error                                                       |
| `fromSupplier`  | delay execution by using `Supplier<T>`                           |
| `fromCallable`  | delay execution by using `Callable<T>`                           |
| `fromFuture`    | Publish from `CompletableFuture<T>`                              |
| `fromRunnable`  | Emitting empty after method invocation                           |

