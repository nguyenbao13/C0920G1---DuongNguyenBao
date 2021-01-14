package blog.repository;

import blog.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Blog> findAll() {
        return null;
    }

    @Override
    public Blog findById(Long id) {
        return null;
    }

    @Override
    public void save(Blog model) {

    }

    @Override
    public void remove(Long id) {

    }
}
