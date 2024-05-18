import { NativeModulesProxy, EventEmitter, Subscription } from 'expo-modules-core';

// Import the native module. On web, it will be resolved to ExpoViewDeclarative.web.ts
// and on native platforms to ExpoViewDeclarative.ts
import ExpoViewDeclarativeModule from './ExpoViewDeclarativeModule';
import ExpoViewDeclarativeView from './ExpoViewDeclarativeView';
import { ChangeEventPayload, ExpoViewDeclarativeViewProps } from './ExpoViewDeclarative.types';

// Get the native constant value.
export const PI = ExpoViewDeclarativeModule.PI;

export function hello(): string {
  return ExpoViewDeclarativeModule.hello();
}

export async function setValueAsync(value: string) {
  return await ExpoViewDeclarativeModule.setValueAsync(value);
}

const emitter = new EventEmitter(ExpoViewDeclarativeModule ?? NativeModulesProxy.ExpoViewDeclarative);

export function addChangeListener(listener: (event: ChangeEventPayload) => void): Subscription {
  return emitter.addListener<ChangeEventPayload>('onChange', listener);
}

export { ExpoViewDeclarativeView, ExpoViewDeclarativeViewProps, ChangeEventPayload };
