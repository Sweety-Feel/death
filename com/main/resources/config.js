var ioc = {
  dao : {
    type : "org.nutz.dao.impl.NutDao",
    args : [ {
      refer : "dataSource"
    } ]
  },
  dataSource : {
    type : "com.alibaba.druid.pool.DruidDataSource",
    events : {
      init : 'init',
      depose : 'close'
    },
    fields : {
      url : {
        java : "$config.get('jdbc-url')"
      },
      username : {
        java : "$config.get('jdbc-user')"
      },
      password : {
        java : "$config.get('jdbc-password')"
      },
      maxActive : 30,
      defaultAutoCommit : false,
      filters : "mergeStat,wall",
    }
  },
  config : {
    type : "org.nutz.ioc.impl.PropertiesProxy",
    fields : {
      paths : [ "config.properties" ]
    }
  }
};