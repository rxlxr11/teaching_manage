import request from '@/utils/request'

// 查询学业情况查询列表
export function listCredit(query) {
  return request({
    url: '/info/credit/list',
    method: 'get',
    params: query
  })
}

// 查询学业情况查询详细
export function getCredit(id) {
  return request({
    url: '/info/credit/' + id,
    method: 'get'
  })
}

// 新增学业情况查询
export function addCredit(data) {
  return request({
    url: '/info/credit',
    method: 'post',
    data: data
  })
}

// 修改学业情况查询
export function updateCredit(data) {
  return request({
    url: '/info/credit',
    method: 'put',
    data: data
  })
}

// 删除学业情况查询
export function delCredit(id) {
  return request({
    url: '/info/credit/' + id,
    method: 'delete'
  })
}
