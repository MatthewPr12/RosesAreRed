package ua.edu.ucu.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlowerService  {
    private static FlowerRepository flowerRepository;
    @Autowired
    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }

    public void addFlower(Flower flower) {
        Optional<Flower> flowerOptional = flowerRepository.findFlowerById(flower.getId());
        if(flowerOptional.isPresent()){
            throw new IllegalStateException("id taken");
        }
        flowerRepository.save(flower);
    }

    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }

    public void deleteFlower(int flowerId) {
        boolean exists = flowerRepository.existsById(flowerId);
        if(!exists){
            throw new IllegalStateException("Flower with id " + flowerId + " does not exist");
        }
        flowerRepository.deleteById(flowerId);

    }
}
