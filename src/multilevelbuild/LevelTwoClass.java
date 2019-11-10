package multilevelbuild;

public class LevelTwoClass extends LevelOneClass {
    private String levelTwoAttribute1;
    private String levelTwoAttribute2;

    private LevelTwoClass(Builder builder) {
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

    public static Builder l2Builder() {
        return new Builder();
    }

    public static final class Builder extends LevelOneBaseBuilder<Builder, LevelTwoClass> {
        private String levelTwoAttribute1;
        private String levelTwoAttribute2;

        private Builder() {
        }

        @Override
        LevelTwoClass build() {
            return new LevelTwoClass(this);
        }

        @Override
        Builder getThis() {
            return this;
        }

        public Builder withLevelTwoAttribute1(String levelTwoAttribute1) {
            this.levelTwoAttribute1 = levelTwoAttribute1;
            return this;
        }

        public Builder withLevelTwoAttribute2(String levelTwoAttribute2) {
            this.levelTwoAttribute2 = levelTwoAttribute2;
            return this;
        }
    }
}
