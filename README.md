# AutoValue Builders + Object Construction Checker Example

This is a sample repository showing how to check usage of [AutoValue Builders](https://github.com/google/auto/blob/master/value/userguide/builders.md)
with the [Object Construction Checker](https://github.com/kelloggm/object-construction-checker).  The checker ensures that
all required methods have been called on a builder before its `build()` method is invoked.  If you clone 
this repository and run `./gradlew compileJava`, you will see the following error:

```
src/main/java/example/Animal.java:30: error: [finalizer.invocation.invalid] This finalizer cannot be invoked, because the following methods have not been called: setName() setNumberOfLegs()
    return builder().build();
                          ^
1 error
```
