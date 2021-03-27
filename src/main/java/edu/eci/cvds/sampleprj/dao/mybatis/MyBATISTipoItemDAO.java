package edu.eci.cvds.sampleprj.dao.mybatis;
import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.TipoItemDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.TipoItemMapper;
import edu.eci.cvds.samples.entities.TipoItem;
import java.util.*;

public class MyBATISTipoItemDAO implements TipoItemDAO {

    @Inject
    private TipoItemMapper tipoItemMapper;

    @Override
    public TipoItem load(int id) throws PersistenceException {
        return tipoItemMapper.getTipoItem(id);
    }

    @Override
    public void save(String des) throws PersistenceException {}

    @Override
    public List<TipoItem> loadAll() throws PersistenceException {
        return null;
    }
}
