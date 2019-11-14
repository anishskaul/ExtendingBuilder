package multilevelbuild;

class BaseClass {
    private String baseAttribute1;
    private String baseAttribute2;

    BaseClass(ExtendableBuilder builder) {
        baseAttribute1 = builder.baseAttribute1;
        baseAttribute2 = builder.baseAttribute2;
    }

    public String getBaseAttribute1() {
        return baseAttribute1;
    }

    public String getBaseAttribute2() {
        return baseAttribute2;
    }

    public static Builder baseClassBuilder() {
        return new Builder();
    }

    public static class Builder extends ExtendableBuilder<Builder, BaseClass> {

        @Override
        public BaseClass build() {
            return new BaseClass(this);
        }

        @Override
        public Builder getThis() {
            return this;
        }
    }

    static abstract class ExtendableBuilder<T extends ExtendableBuilder, R extends BaseClass>
            implements ExtendableBuilders<T, R> {
        private String baseAttribute1;
        private String baseAttribute2;

        ExtendableBuilder() {
        }

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
