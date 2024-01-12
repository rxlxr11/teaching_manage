import request from '@/utils/request'

// 查询自主选课列表
export function listSelect(query) {
  return request({
    url: '/course/select/list',
    method: 'get',
    params: query
  })
}

// 查询自主选课详细
export function getSelect(id) {
  return request({
    url: '/course/select/' + id,
    method: 'get'
  })
}

// 新增自主选课
export function addSelect(data) {
  return request({
    url: '/course/select',
    method: 'post',
    data: data
  })
}

// 修改自主选课
export function updateSelect(data) {
  return request({
    url: '/course/select',
    method: 'put',
    data: data
  })
}

// 删除自主选课
export function delSelect(id) {
  return request({
    url: '/course/select/' + id,
    method: 'delete'
  })
}
