package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.eci.cvds.sampleprj.dao.ItemDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.eci.cvds.samples.entities.TipoItem;
import java.sql.SQLException;
import java.util.List;

public class MyBATISItemDAO implements ItemDAO{

    @Inject
    private ItemMapper itemMapper;

    @Override
    public void save(Item it) throws PersistenceException{
        try{
            itemMapper.insertarItem(it);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al registrar el item "+it.toString(),e);
        }

    }

    @Override
    public Item load(int id) throws PersistenceException {
        try{
            return itemMapper.consultarItem(id);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al consultar el item "+id,e);
        }


    }
    @Override
    public void addItem(Item i){}

    @Override
    public List<Item> loadAll() throws PersistenceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Item> loadAvailableItems() throws PersistenceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TipoItem loadTipoItem(int id) throws PersistenceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long consultarCostoAlquiler(int iditem, int numdias) throws PersistenceException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void actualizarTarifa(int id, long tarifa) throws PersistenceException {
        // TODO Auto-generated method stub
        
        
    }

}