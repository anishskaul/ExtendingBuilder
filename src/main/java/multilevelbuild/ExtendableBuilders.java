package multilevelbuild;

public interface ExtendableBuilders<T extends ExtendableBuilders, R> {

    R build();

    T getThis();
}
