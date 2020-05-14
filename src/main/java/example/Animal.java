package example;

import com.google.auto.value.AutoValue;
import org.checkerframework.checker.nullness.qual.Nullable;

@AutoValue
abstract class Animal {
  abstract String name();
  @Nullable
  abstract String species();
  abstract int numberOfLegs();

  static Builder builder() {
    return new AutoValue_Animal.Builder();
  }

  @AutoValue.Builder
  abstract static class Builder {
    abstract Builder setName(String value);
    abstract Builder setSpecies(String value);
    abstract Builder setNumberOfLegs(int value);
    abstract Animal build();
  }

  static Animal buildCorrectly() {
    return builder().setName("Frank").setNumberOfLegs(4).build();
  }

  static Animal buildIncorrectly() {
    return builder().build();
  }
}
