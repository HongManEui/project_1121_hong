
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import MenuView from "./components/MenuView"
import MenuViewDetail from "./components/MenuViewDetail"
import OrderStateView from "./components/OrderStateView"
import OrderStateViewDetail from "./components/OrderStateViewDetail"
import PayManager from "./components/listers/PayCards"
import PayDetail from "./components/listers/PayDetail"

import OrderManagementManager from "./components/listers/OrderManagementCards"
import OrderManagementDetail from "./components/listers/OrderManagementDetail"

import CookManager from "./components/listers/CookCards"
import CookDetail from "./components/listers/CookDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/menus',
                name: 'MenuView',
                component: MenuView
            },
            {
                path: '/menus/:id',
                name: 'MenuViewDetail',
                component: MenuViewDetail
            },
            {
                path: '/orderStates',
                name: 'OrderStateView',
                component: OrderStateView
            },
            {
                path: '/orderStates/:id',
                name: 'OrderStateViewDetail',
                component: OrderStateViewDetail
            },
            {
                path: '/pays',
                name: 'PayManager',
                component: PayManager
            },
            {
                path: '/pays/:id',
                name: 'PayDetail',
                component: PayDetail
            },

            {
                path: '/orderManagements',
                name: 'OrderManagementManager',
                component: OrderManagementManager
            },
            {
                path: '/orderManagements/:id',
                name: 'OrderManagementDetail',
                component: OrderManagementDetail
            },

            {
                path: '/cooks',
                name: 'CookManager',
                component: CookManager
            },
            {
                path: '/cooks/:id',
                name: 'CookDetail',
                component: CookDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },




    ]
})
