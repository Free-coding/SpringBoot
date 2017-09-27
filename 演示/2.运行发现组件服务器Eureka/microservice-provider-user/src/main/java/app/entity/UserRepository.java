package app.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 吴文韬 on 2017/9/26.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
