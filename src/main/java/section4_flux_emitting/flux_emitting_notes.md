#

---

## Flux.create -> FluxSink

- It is designed to be used when we have single subscriber
- FluxSink is thread safe. We can share it with multiple threads
- We can keep on emitting data into the sink without worrying about downstream demand
- FluxSink will deliver everything to Subscriber safely

---

## Flux Generate with State

---

## Flux - create / generate

| Create                                                                                 | Generate                                                            |
|----------------------------------------------------------------------------------------|---------------------------------------------------------------------|
| Accepts a Consumer<FluxSink<T>>                                                        | Accepts a Consumer<SynchronousSink<T>>                              |
| Consumer is invoked only once                                                          | Consumer is invoked again and again                                 |
| Consumer can emit $0..n$ elements immediately without worrying about downstream demand | Consumer can emit only one element. Downstream demand is respected. |
| Thread-safe                                                                            | N/A                                                                 |

--

## Flux.create -> FluxSink

- It is designed to be used when we have a single subscriber
- FluxSink is thread safe. We can share it with multiple threads
- We can keep emitting data into the sink without worrying about the downstream demand
- FluxSink will deliver everything to a Subscriber safely

### Things to consider

- What if I want to have multiple subscribers?
- Backpressure handling