//1、refer:xb
//var ioc = {
//    xb : {
//      type : 'app.bean.pojo.Pet'
//        fields : {
//            name : 'XiaoBai',
//            age : '20'
//        }
//    }
//    xiaohei :{
//      type :'app.bean.pojo.Pet',
//      fields:{
//        name : 'xiaohei'
//        age : '18',
//        friend :{refer :'xb'}
//      }
//    }
//}
//2、直接在xiaobai的friend 里加fields
//var ioc ={
//    xiaobai :{
//      name :'xb',
//      friend :{
//        type : 'app.bean.pojo.Pet',
//        fields : {
//          name : 'xiaohei'
//        }
//      }
//    }
//}

//3、事件监听
var ioc = {
    xb:{
      events :{
        fetch : 'onFetch'
      },
      fields:{
        name : 'xiaobai'//{env:"JAVA_HOME"},
        friend :{
          name : 'xiaohei'
          age : '20'
        }
      }
    }
}