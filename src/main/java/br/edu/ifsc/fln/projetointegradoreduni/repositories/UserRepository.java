package br.edu.ifsc.fln.projetointegradoreduni.repositories;


import br.edu.ifsc.fln.projetointegradoreduni.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    public UserEntity findByUsername(String username);

}
