package ge.ibsu.demo.controllers;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @PostMapping
    public City addCity(@RequestBody City city) {
        return cityRepository.save(city);
    }

    @GetMapping
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
}

