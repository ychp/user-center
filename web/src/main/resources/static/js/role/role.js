function putOtherParams(params, dataset) {
}

function factoryChild(it) {
    return $('<tr>'
        + '<td>' + it['id'] + '</td>'
        + '<td>' + it['name'] + '</td>'
        + '<td>'
        + '\r\n<a href="#">应用授权</a>'
        + '\r\n<a data-info="' + JSON.stringify(it) + '" href="#">编辑</a>'
        + '\r\n<a href="#">删除</a>'
        + '</td>'
        + '</tr>');
}

