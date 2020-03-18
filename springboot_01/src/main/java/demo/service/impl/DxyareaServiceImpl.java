package demo.service.impl;


import demo.model.Dxyarea;
import demo.service.DxyareaService;
import demo.service.base.BaseServiceImpl;
import demo.utils.ServerResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DxyareaServiceImpl extends BaseServiceImpl<Dxyarea> implements DxyareaService {


    @Override
    public ServerResponse insert(Dxyarea dxyarea) {
        return null;
    }

    @Override
    public ServerResponse delete(int id) {
        return null;
    }

    @Override
    public ServerResponse update(Dxyarea dxyarea) {
        return null;
    }

    @Override
    public ServerResponse get(int id) {
        Dxyarea dxyarea = dxyareaMapper.selectByPrimaryKey(id);
        System.out.println(dxyarea);
        System.out.println(ServerResponse.createBySuccess(dxyarea));
        return ServerResponse.createBySuccess(dxyarea);
    }

    @Override
    public ServerResponse findAll() {
//        return ServerResponse.createBySuccess(dxyareaMapper.findAll());
        return null;
    }

    @Override
    public int getCountById(int id) {
        return 0;
    }

    @Override
    public ServerResponse getyName(String name) {
        return null;
    }

    public static void main(String[] args)
    {
        Integer a= 10;
        System.out.println(ServerResponse.createBySuccess(a));

    }

}
