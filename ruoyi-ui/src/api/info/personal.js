import request from '@/utils/request'

// 查询个人信息列表
export function listPersonal(query) {
  return request({
    url: '/info/personal/list',
    method: 'get',
    params: query
  })
}

// 查询个人信息详细
export function getPersonal(stuId) {
  return request({
    url: '/info/personal/' + stuId,
    method: 'get'
  })
}

// 新增个人信息
export function addPersonal(data) {
  return request({
    url: '/info/personal',
    method: 'post',
    data: data
  })
}

// 修改个人信息
export function updatePersonal(data) {
  return request({
    url: '/info/personal',
    method: 'put',
    data: data
  })
}

// 删除个人信息
export function delPersonal(stuId) {
  return request({
    url: '/info/personal/' + stuId,
    method: 'delete'
  })
}
