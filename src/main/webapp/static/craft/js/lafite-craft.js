var ajaxCraft = (function($){
    var $$ = $;
    var baseUrl = '';
    var findByIdUrl = '';
    var findUrl = '';
    var saveUrl = '';
    var saveListUrl = '';
    var updateUrl = '';
    var updateListUrl = '';
    var removeUrl = '';
    var removeListUrl = '';
    /*初始化路径*/
    var init = function (basePath) {
        debugger
        var that = this;
        baseUrl = basePath;
        findByIdUrl = basePath + '/find_by_id';
        findUrl = basePath + '/find';
        saveUrl = basePath + '/save';
        saveListUrl = basePath + '/save_list';
        updateUrl = basePath + '/update';
        updateListUrl = basePath + '/update_list';
        removeUrl = basePath + '/remove';
        removeListUrl = basePath + '/remove_list';
        return that;
    }
    /*通过ID查询*/
    var findById = function (id, callback) {
        $$.post(findByIdUrl, {'id': id}, function (result) {
            if(result.error){
                throw error.message;
            }else {
                callback(result);
            }
        });
    }

    var find = function (pageNum, pageSize, where, callback) {
        $$.post(findUrl, {
            'pageNum': pageNum,
            'pageSize': pageSize,
            'where': JSON.stringify(where)
        }, function (data) {
            if(data.error){
                throw error.message;
            }else {
                callback(data);
            }
        });
    }

    /*保存*/
    var save = function (entity, callback) {
        $$.post(saveUrl, {'entity': JSON.stringify(entity)}, function (result) {
            if(result.error){
                throw error.message;
            }else {
                callback(result);
            }
        });
    }

    /*保存多个*/
    var saveList = function (entityList, callback) {
        $$.post(saveListUrl, {'entityList': JSON.stringify(entityList)}, function (result) {
            if(result.error){
                throw error.message;
            }else {
                callback(result);
            }
        });
    }

    /*修改*/
    var update = function (entity, callback) {
        $$.post(updateUrl, {'entity': JSON.stringify(entity)}, function (result) {
            if(result.error){
                throw error.message;
            }else {
                callback(result);
            }
        });
    }

    /*修改多个*/
    var updateList = function (entityList, callback) {
        $$.post(updateListUrl, {'entityList': JSON.stringify(entityList)}, function (result) {
            if(result.error){
                throw error.message;
            }else {
                callback(result);
            }
        });
    }

    /*删除*/
    var remove = function (id, callback) {
        $$.post(removeUrl, {'id': id}, function (result) {
            if(result.error){
                throw error.message;
            }else {
                callback(result);
            }
        });
    }

    /*删除多个*/
    var removeList = function (idList, callback) {
        $$.post(removeListUrl, {'ids': JSON.stringify(idList)}, function (result) {
            if(result.error){
                throw error.message;
            }else {
                callback(result);
            }
        });
    }

    return {
        init: init,
        findById: findById,
        find: find,
        save: save,
        saveList: saveList,
        remove: remove,
        removeList: removeList,
        update: update,
        updateList: updateList
    }
})($);

/**
 * 按钮权限
 * 参数说明：1.btnid 按钮的的标签的id属性 id为batchdel   <a id="batchdel" v-if="authority" href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
 *           2.url 按钮执行操作接口的url    /dept/delete
 */
function permissions(btnid,url) {
    var permissions = new Vue({
        el:'#'+btnid,
        data:{
            authority:functionUrl.indexOf(url) >= 0
        }
    })
}

