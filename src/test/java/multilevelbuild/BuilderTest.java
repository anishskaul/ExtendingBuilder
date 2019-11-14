package multilevelbuild;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BuilderTest {

    private static final String BASE_1 = "base1";
    private static final String BASE_2 = "base2";

    private static final String LEVEL_ONE_ONE = "levelOne-One";
    private static final String LEVEL_ONE_TWO = "levelOne-Two";

    private static final String LEVEL_TWO_ONE = "levelTwo-one";
    private static final String LEVEL_TWO_TWO = "levelTwo-two";

    @Test
    void testLevelTwoBuilder() {
        LevelTwoClass target = LevelTwoClass.levelTwoClassBuilder()
                .withBaseAttribute1(BASE_1)
                .withLevelOneAttribute1(LEVEL_ONE_ONE)
                .withLevelTwoAttribute1(LEVEL_TWO_ONE)
                .withLevelTwoAttribute2(LEVEL_TWO_TWO)
                .withLevelOneAttribute2(LEVEL_ONE_TWO)
                .withBaseAttribute2(BASE_2)
                .build();

        Assertions.assertEquals(BASE_1, target.getBaseAttribute1());
        Assertions.assertEquals(BASE_2, target.getBaseAttribute2());

        Assertions.assertEquals(LEVEL_ONE_ONE, target.getLevelOneAttribute1());
        Assertions.assertEquals(LEVEL_ONE_TWO, target.getLevelOneAttribute2());

        Assertions.assertEquals(LEVEL_TWO_ONE, target.getLevelTwoAttribute1());
        Assertions.assertEquals(LEVEL_TWO_TWO, target.getLevelTwoAttribute2());
    }

    @Test
    void testLevelOneBuilder() {
        LevelOneClass target = LevelOneClass.levelOneClassBuilder()
                .withBaseAttribute1(BASE_1)
                .withLevelOneAttribute1(LEVEL_ONE_ONE)
                .withLevelOneAttribute2(LEVEL_ONE_TWO)
                .withBaseAttribute2(BASE_2)
                .build();

        Assertions.assertEquals(BASE_1, target.getBaseAttribute1());
        Assertions.assertEquals(BASE_2, target.getBaseAttribute2());

        Assertions.assertEquals(LEVEL_ONE_ONE, target.getLevelOneAttribute1());
        Assertions.assertEquals(LEVEL_ONE_TWO, target.getLevelOneAttribute2());
    }

}