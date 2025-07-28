# Testing with step verifier

---

---

## Summary

- StepVerifier.create(...)
- Next
  - expectNext(...)
  - expectNextCount()
  - thenConsumerWhile(...)
  - assertNext(...)
- Verify
  - expectComplete()
  - expectError()
- Virtual Time Scheduler
  - StepVerifier.withVirtualTime(() -> getFlux)
  - thenAwait(Duration)
- StepVerifierOptions
  - Context
  - Scenario name
- Test Publisher
  - Flux/Mono to be consumed by the app
  - emit/next to emit items