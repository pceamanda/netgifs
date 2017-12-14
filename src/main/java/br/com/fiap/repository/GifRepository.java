package br.com.fiap.repository;

import br.com.fiap.entity.Gif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GifRepository extends JpaRepository<Gif, Integer> {
}