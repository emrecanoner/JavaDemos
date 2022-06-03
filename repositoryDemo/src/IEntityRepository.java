public interface IEntityRepository<T extends IEntity > {
    void add(T entity);
    void delete(T rntity);
    void update(T entity);
}
