package multilevelbuild;

public class LevelOneClass extends BaseClass {
    private String levelOneAttribute1;
    private String levelOneAttribute2;

    LevelOneClass(LevelOneBaseBuilder builder) {
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

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends LevelOneBaseBuilder<Builder, LevelOneClass> {

        @Override
        LevelOneClass build() {
            return new LevelOneClass(this);
        }

        @Override
        Builder getThis() {
            return this;
        }
    }

    static abstract class LevelOneBaseBuilder<T extends BaseClass.Builder, R extends LevelOneClass>
            extends BaseClass.Builder<T, R> {
        private String levelOneAttribute1;
        private String levelOneAttribute2;

        LevelOneBaseBuilder() {
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
