package edu.miu.cs.cs425.sweprojectmycopy.repository;


import edu.miu.cs.cs425.sweprojectmycopy.model.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatagoryRepository extends JpaRepository<Catagory, Long> {

}
