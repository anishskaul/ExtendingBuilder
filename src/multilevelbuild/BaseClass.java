package multilevelbuild;

class BaseClass {
    private String baseAttribute1;
    private String baseAttribute2;

    BaseClass(Builder builder) {
        baseAttribute1 = builder.baseAttribute1;
        baseAttribute2 = builder.baseAttribute2;
    }

    public String getBaseAttribute1() {
        return baseAttribute1;
    }

    public String getBaseAttribute2() {
        return baseAttribute2;
    }

    static abstract class Builder<T extends Builder, R extends BaseClass> {
        private String baseAttribute1;
        private String baseAttribute2;

        Builder() {
        }

        abstract R build();

        abstract T getThis();

        public T withBaseAttribute1(String baseAttribute1) {
            this.baseAttribute1 = baseAttribute1;
            return getThis();
        }

        public T withBaseAttribute2(String baseAttribute2) {
            this.baseAttribute2 = baseAttribute2;
            return getThis();
        }
    }
}
