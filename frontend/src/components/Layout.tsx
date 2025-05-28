import React from 'react';
import { Outlet, Link, useLocation } from 'react-router-dom';
import { BarChart3, ClipboardList, Home, Package, LogOut } from 'lucide-react';
import { cn } from '../lib/utils';

const navigation = [
  { name: 'Dashboard', href: '/', icon: Home },
  { name: 'Inventory', href: '/inventory', icon: Package },
  { name: 'Billing', href: '/billing', icon: ClipboardList },
  { name: 'Reports', href: '/reports', icon: BarChart3 },
];

function Layout() {
  const location = useLocation();

  return (
    <div className="min-h-screen bg-gray-100">
      <div className="flex h-screen">
        {/* Sidebar */}
        <div className="w-64 bg-white shadow-lg">
          <div className="flex h-16 items-center justify-center border-b">
            <h1 className="text-xl font-bold text-gray-900">Bakery Management</h1>
          </div>
          <nav className="mt-6 px-2">
            {navigation.map((item) => {
              const Icon = item.icon;
              const isActive = location.pathname === item.href;
              return (
                <Link
                  key={item.name}
                  to={item.href}
                  className={cn(
                    'group flex items-center px-4 py-3 text-sm font-medium rounded-md my-1',
                    isActive
                      ? 'bg-blue-50 text-blue-700'
                      : 'text-gray-700 hover:bg-gray-50'
                  )}
                >
                  <Icon
                    className={cn(
                      'mr-3 h-5 w-5',
                      isActive ? 'text-blue-700' : 'text-gray-400'
                    )}
                  />
                  {item.name}
                </Link>
              );
            })}
          </nav>
          <div className="absolute bottom-0 w-64 p-4 border-t">
            <button className="flex items-center px-4 py-2 text-sm font-medium text-gray-700 hover:bg-gray-50 rounded-md w-full">
              <LogOut className="mr-3 h-5 w-5 text-gray-400" />
              Sign Out
            </button>
          </div>
        </div>

        {/* Main content */}
        <div className="flex-1 overflow-auto">
          <div className="py-6 px-8">
            <Outlet />
          </div>
        </div>
      </div>
    </div>
  );
}

export default Layout;