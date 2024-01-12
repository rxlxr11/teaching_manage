import request from '@/utils/request'

// 查询学年管理列表
export function listAcayear(query) {
  return request({
    url: '/manage/acayear/list',
    method: 'get',
    params: query
  })
}

// 查询学年管理详细
export function getAcayear(yearId) {
  return request({
    url: '/manage/acayear/' + yearId,
    method: 'get'
  })
}

// 新增学年管理
export function addAcayear(data) {
  return request({
    url: '/manage/acayear',
    method: 'post',
    data: data
  })
}

// 修改学年管理
export function updateAcayear(data) {
  return request({
    url: '/manage/acayear',
    method: 'put',
    data: data
  })
}

// 删除学年管理
export function delAcayear(yearId) {
  return request({
    url: '/manage/acayear/' + yearId,
    method: 'delete'
  })
}
