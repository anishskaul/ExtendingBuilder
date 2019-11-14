package multilevelbuild;

public class LevelTwoClass extends LevelOneClass {
    private String levelTwoAttribute1;
    private String levelTwoAttribute2;

    private LevelTwoClass(ExtendableBuilder builder) {
        super(builder);
        levelTwoAttribute1 = builder.levelTwoAttribute1;
        levelTwoAttribute2 = builder.levelTwoAttribute2;
    }

    public String getLevelTwoAttribute1() {
        return levelTwoAttribute1;
    }

    public String getLevelTwoAttribute2() {
        return levelTwoAttribute2;
    }

    public static Builder levelTwoClassBuilder() {
        return new Builder();
    }

    public static final class Builder extends ExtendableBuilder<Builder, LevelTwoClass> {

        @Override
        public LevelTwoClass build() {
            return new LevelTwoClass(this);
        }

        @Override
        public Builder getThis() {
            return this;
        }
    }

    static abstract class ExtendableBuilder<T extends ExtendableBuilder, R extends LevelTwoClass>
            extends LevelOneClass.ExtendableBuilder<T, R> {
        private String levelTwoAttribute1;
        private String levelTwoAttribute2;

        private ExtendableBuilder() {
        }

        public T withLevelTwoAttribute1(String levelTwoAttribute1) {
            this.levelTwoAttribute1 = levelTwoAttribute1;
            return getThis();
        }

        public T withLevelTwoAttribute2(String levelTwoAttribute2) {
            this.levelTwoAttribute2 = levelTwoAttribute2;
            return getThis();
        }
    }
}
