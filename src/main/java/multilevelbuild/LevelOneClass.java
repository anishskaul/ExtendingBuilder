package multilevelbuild;

public class LevelOneClass extends BaseClass {
    private String levelOneAttribute1;
    private String levelOneAttribute2;

    LevelOneClass(ExtendableBuilder builder) {
        super(builder);
        levelOneAttribute1 = builder.levelOneAttribute1;
        levelOneAttribute2 = builder.levelOneAttribute2;
    }

    public String getLevelOneAttribute1() {
        return levelOneAttribute1;
    }

    public String getLevelOneAttribute2() {
        return levelOneAttribute2;
    }

    public static Builder levelOneClassBuilder() {
        return new Builder();
    }

    public static final class Builder extends ExtendableBuilder<Builder, LevelOneClass> {

        @Override
        public LevelOneClass build() {
            return new LevelOneClass(this);
        }

        @Override
        public Builder getThis() {
            return this;
        }
    }

    static abstract class ExtendableBuilder<T extends ExtendableBuilder, R extends LevelOneClass>
            extends BaseClass.ExtendableBuilder<T, R> {
        private String levelOneAttribute1;
        private String levelOneAttribute2;

        ExtendableBuilder() {
        }

        public T withLevelOneAttribute1(String levelOneAttribute1) {
            this.levelOneAttribute1 = levelOneAttribute1;
            return getThis();
        }

        public T withLevelOneAttribute2(String levelOneAttribute2) {
            this.levelOneAttribute2 = levelOneAttribute2;
                    return getThis();
        }
    }
}
