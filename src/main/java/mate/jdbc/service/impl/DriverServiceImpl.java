package mate.jdbc.service.impl;

import java.util.List;
import mate.jdbc.dao.DriverDao;
import mate.jdbc.lib.Injector;
import mate.jdbc.lib.Service;
import mate.jdbc.model.Driver;
import mate.jdbc.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {
    private final Injector injector = Injector.getInstance("mate.jdbc");
    private final DriverDao driverDao;

    {
        driverDao = (DriverDao) injector.getInstance(DriverDao.class);
    }

    @Override
    public Driver create(Driver driver) {
        return driverDao.create(driver);
    }

    @Override
    public Driver get(Long id) {
        if (driverDao.get(id).isPresent()) {
            return driverDao.get(id).get();
        }
        throw new RuntimeException("Can't find driver with such id: " + id);
    }

    @Override
    public List<Driver> getAll() {
        return driverDao.getAll();
    }

    @Override
    public Driver update(Driver driver) {
        return driverDao.update(driver);
    }

    @Override
    public boolean delete(Long id) {
        return driverDao.delete(id);
    }
}
