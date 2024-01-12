import request from '@/utils/request'

// 查询专业管理列表
export function listMajor(query) {
  return request({
    url: '/manage/major/list',
    method: 'get',
    params: query
  })
}

// 查询专业管理详细
export function getMajor(id) {
  return request({
    url: '/manage/major/' + id,
    method: 'get'
  })
}

// 新增专业管理
export function addMajor(data) {
  return request({
    url: '/manage/major',
    method: 'post',
    data: data
  })
}

// 修改专业管理
export function updateMajor(data) {
  return request({
    url: '/manage/major',
    method: 'put',
    data: data
  })
}

// 删除专业管理
export function delMajor(id) {
  return request({
    url: '/manage/major/' + id,
    method: 'delete'
  })
}
