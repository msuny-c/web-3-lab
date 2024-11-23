package ru.itmo.app.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import ru.itmo.app.bean.AttemptBackingBean;
import ru.itmo.app.checker.IAreaChecker;
import ru.itmo.app.entity.AttemptEntity;
import ru.itmo.app.repository.IAttemptRepository;

@Default
@ApplicationScoped
public class AttemptService implements IAttemptService {
    @Inject private IAttemptRepository repository;
    @Inject private IAreaChecker checker;
    @Override
    public void save(AttemptBackingBean attempt) {
        var entity = new AttemptEntity();
        var success = checker.inArea(attempt);
        entity.setX(attempt.getX());
        entity.setY(attempt.getY());
        entity.setR(attempt.getR());
        entity.setSuccess(success);
        repository.save(entity);
    }
    @Override
    public List<AttemptEntity> getAll() {
        return repository.getAll();
    }
}
